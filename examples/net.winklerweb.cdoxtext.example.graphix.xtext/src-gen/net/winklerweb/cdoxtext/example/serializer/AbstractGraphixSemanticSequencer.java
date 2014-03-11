package net.winklerweb.cdoxtext.example.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.winklerweb.cdoxtext.example.graphix.Circle;
import net.winklerweb.cdoxtext.example.graphix.Color;
import net.winklerweb.cdoxtext.example.graphix.GraphixCanvas;
import net.winklerweb.cdoxtext.example.graphix.GraphixPackage;
import net.winklerweb.cdoxtext.example.graphix.Point;
import net.winklerweb.cdoxtext.example.services.GraphixGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractGraphixSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GraphixGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GraphixPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GraphixPackage.CIRCLE:
				if(context == grammarAccess.getCircleRule() ||
				   context == grammarAccess.getGraphixElementRule()) {
					sequence_Circle(context, (Circle) semanticObject); 
					return; 
				}
				else break;
			case GraphixPackage.COLOR:
				if(context == grammarAccess.getColorRule() ||
				   context == grammarAccess.getGraphixElementRule()) {
					sequence_Color(context, (Color) semanticObject); 
					return; 
				}
				else break;
			case GraphixPackage.GRAPHIX_CANVAS:
				if(context == grammarAccess.getGraphixCanvasRule()) {
					sequence_GraphixCanvas(context, (GraphixCanvas) semanticObject); 
					return; 
				}
				else break;
			case GraphixPackage.POINT:
				if(context == grammarAccess.getPointRule()) {
					sequence_Point(context, (Point) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (center=Point radius=EDouble (lineColor=[Color|EString] | fillColor=[Color|EString])*)
	 */
	protected void sequence_Circle(EObject context, Circle semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString red=EDouble green=EDouble blue=EDouble alpha=EDouble?)
	 */
	protected void sequence_Color(EObject context, Color semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lowerLeftBounds=Point upperRightBounds=Point (content+=GraphixElement content+=GraphixElement*)?)
	 */
	protected void sequence_GraphixCanvas(EObject context, GraphixCanvas semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x=EDouble y=EDouble)
	 */
	protected void sequence_Point(EObject context, Point semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, GraphixPackage.Literals.POINT__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, GraphixPackage.Literals.POINT__Y));
			if(transientValues.isValueTransient((EObject)semanticObject, GraphixPackage.Literals.POINT__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, GraphixPackage.Literals.POINT__X));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getPointAccess().getXEDoubleParserRuleCall_2_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPointAccess().getYEDoubleParserRuleCall_4_0(), semanticObject.getY());
		feeder.finish();
	}
}
