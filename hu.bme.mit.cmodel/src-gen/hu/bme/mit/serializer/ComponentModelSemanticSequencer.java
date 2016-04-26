/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.serializer;

import com.google.inject.Inject;
import hu.bme.mit.componentModel.CompConnDec;
import hu.bme.mit.componentModel.ComponentFeature;
import hu.bme.mit.componentModel.ComponentImpl;
import hu.bme.mit.componentModel.ComponentModel;
import hu.bme.mit.componentModel.ComponentModelPackage;
import hu.bme.mit.componentModel.ComponentType;
import hu.bme.mit.componentModel.ImportE;
import hu.bme.mit.componentModel.InPort;
import hu.bme.mit.componentModel.OutPort;
import hu.bme.mit.componentModel.PortType;
import hu.bme.mit.componentModel.SystemConnDec;
import hu.bme.mit.componentModel.SystemDec;
import hu.bme.mit.componentModel.SystemPortIn;
import hu.bme.mit.componentModel.SystemPortOut;
import hu.bme.mit.componentModel.errorModes;
import hu.bme.mit.services.ComponentModelGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ComponentModelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ComponentModelGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ComponentModelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentModelPackage.COMP_CONN_DEC:
				sequence_CompConnDec(context, (CompConnDec) semanticObject); 
				return; 
			case ComponentModelPackage.COMPONENT_FEATURE:
				sequence_ComponentFeature(context, (ComponentFeature) semanticObject); 
				return; 
			case ComponentModelPackage.COMPONENT_IMPL:
				sequence_ComponentImpl(context, (ComponentImpl) semanticObject); 
				return; 
			case ComponentModelPackage.COMPONENT_MODEL:
				sequence_ComponentModel(context, (ComponentModel) semanticObject); 
				return; 
			case ComponentModelPackage.COMPONENT_TYPE:
				sequence_ComponentType(context, (ComponentType) semanticObject); 
				return; 
			case ComponentModelPackage.IMPORT_E:
				sequence_ImportE(context, (ImportE) semanticObject); 
				return; 
			case ComponentModelPackage.IN_PORT:
				sequence_InPort(context, (InPort) semanticObject); 
				return; 
			case ComponentModelPackage.OUT_PORT:
				sequence_OutPort(context, (OutPort) semanticObject); 
				return; 
			case ComponentModelPackage.PORT_TYPE:
				sequence_PortType(context, (PortType) semanticObject); 
				return; 
			case ComponentModelPackage.SYSTEM_CONN_DEC:
				sequence_SystemConnDec(context, (SystemConnDec) semanticObject); 
				return; 
			case ComponentModelPackage.SYSTEM_DEC:
				sequence_SystemDec(context, (SystemDec) semanticObject); 
				return; 
			case ComponentModelPackage.SYSTEM_PORT_IN:
				sequence_SystemPortIn(context, (SystemPortIn) semanticObject); 
				return; 
			case ComponentModelPackage.SYSTEM_PORT_OUT:
				sequence_SystemPortOut(context, (SystemPortOut) semanticObject); 
				return; 
			case ComponentModelPackage.ERROR_MODES:
				sequence_errorModes(context, (errorModes) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractFeatures returns CompConnDec
	 *     CompConnDec returns CompConnDec
	 *
	 * Constraint:
	 *     (name=ID sourceComp=[ComponentImpl|ID] sourcePort=[Port|ID] targetComp=[ComponentImpl|ID] targetPort=[Port|ID])
	 */
	protected void sequence_CompConnDec(ISerializationContext context, CompConnDec semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.ABSTRACT_FEATURES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.ABSTRACT_FEATURES__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.COMP_CONN_DEC__SOURCE_COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.COMP_CONN_DEC__SOURCE_COMP));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.COMP_CONN_DEC__SOURCE_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.COMP_CONN_DEC__SOURCE_PORT));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.COMP_CONN_DEC__TARGET_COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.COMP_CONN_DEC__TARGET_COMP));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.COMP_CONN_DEC__TARGET_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.COMP_CONN_DEC__TARGET_PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCompConnDecAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCompConnDecAccess().getSourceCompComponentImplIDTerminalRuleCall_3_0_1(), semanticObject.getSourceComp());
		feeder.accept(grammarAccess.getCompConnDecAccess().getSourcePortPortIDTerminalRuleCall_5_0_1(), semanticObject.getSourcePort());
		feeder.accept(grammarAccess.getCompConnDecAccess().getTargetCompComponentImplIDTerminalRuleCall_7_0_1(), semanticObject.getTargetComp());
		feeder.accept(grammarAccess.getCompConnDecAccess().getTargetPortPortIDTerminalRuleCall_9_0_1(), semanticObject.getTargetPort());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentFeature returns ComponentFeature
	 *
	 * Constraint:
	 *     ports+=Port
	 */
	protected void sequence_ComponentFeature(ISerializationContext context, ComponentFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractFeatures returns ComponentImpl
	 *     ComponentImpl returns ComponentImpl
	 *
	 * Constraint:
	 *     (name=QualifiedName superType=[ComponentType|ID])
	 */
	protected void sequence_ComponentImpl(ISerializationContext context, ComponentImpl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.ABSTRACT_FEATURES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.ABSTRACT_FEATURES__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.COMPONENT_IMPL__SUPER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.COMPONENT_IMPL__SUPER_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentImplAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeIDTerminalRuleCall_3_0_1(), semanticObject.getSuperType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentModel returns ComponentModel
	 *
	 * Constraint:
	 *     elements+=AbstractElement+
	 */
	protected void sequence_ComponentModel(ISerializationContext context, ComponentModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractFeatures returns ComponentType
	 *     ComponentType returns ComponentType
	 *
	 * Constraint:
	 *     (name=QualifiedName compFeatures+=ComponentFeature*)
	 */
	protected void sequence_ComponentType(ISerializationContext context, ComponentType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns ImportE
	 *     ImportE returns ImportE
	 *
	 * Constraint:
	 *     includedEModel=[ErrorModel|ID]
	 */
	protected void sequence_ImportE(ISerializationContext context, ImportE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.IMPORT_E__INCLUDED_EMODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.IMPORT_E__INCLUDED_EMODEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportEAccess().getIncludedEModelErrorModelIDTerminalRuleCall_1_0_1(), semanticObject.getIncludedEModel());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Port returns InPort
	 *     InPort returns InPort
	 *
	 * Constraint:
	 *     (name=QualifiedName superType=[PortType|ID])
	 */
	protected void sequence_InPort(ISerializationContext context, InPort semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.PORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.PORT__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.PORT__SUPER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.PORT__SUPER_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInPortAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInPortAccess().getSuperTypePortTypeIDTerminalRuleCall_3_0_1(), semanticObject.getSuperType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Port returns OutPort
	 *     OutPort returns OutPort
	 *
	 * Constraint:
	 *     (name=QualifiedName superType=[PortType|ID])
	 */
	protected void sequence_OutPort(ISerializationContext context, OutPort semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.PORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.PORT__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.PORT__SUPER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.PORT__SUPER_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOutPortAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getOutPortAccess().getSuperTypePortTypeIDTerminalRuleCall_3_0_1(), semanticObject.getSuperType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractFeatures returns PortType
	 *     PortType returns PortType
	 *
	 * Constraint:
	 *     (name=QualifiedName eModes=errorModes)
	 */
	protected void sequence_PortType(ISerializationContext context, PortType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.ABSTRACT_FEATURES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.ABSTRACT_FEATURES__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.PORT_TYPE__EMODES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.PORT_TYPE__EMODES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPortTypeAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPortTypeAccess().getEModesErrorModesParserRuleCall_5_0(), semanticObject.getEModes());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns SystemConnDec
	 *     SystemConnDec returns SystemConnDec
	 *
	 * Constraint:
	 *     (name=QualifiedName sourceSystem=[SystemDec|ID] sourcePort=[SystemPortDec|ID] targetSystem=[SystemDec|ID] targetPort=[SystemPortDec|ID])
	 */
	protected void sequence_SystemConnDec(ISerializationContext context, SystemConnDec semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.SYSTEM_CONN_DEC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.SYSTEM_CONN_DEC__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.SYSTEM_CONN_DEC__SOURCE_SYSTEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.SYSTEM_CONN_DEC__SOURCE_SYSTEM));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.SYSTEM_CONN_DEC__SOURCE_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.SYSTEM_CONN_DEC__SOURCE_PORT));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.SYSTEM_CONN_DEC__TARGET_SYSTEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.SYSTEM_CONN_DEC__TARGET_SYSTEM));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.SYSTEM_CONN_DEC__TARGET_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.SYSTEM_CONN_DEC__TARGET_PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSystemConnDecAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecIDTerminalRuleCall_3_0_1(), semanticObject.getSourceSystem());
		feeder.accept(grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecIDTerminalRuleCall_5_0_1(), semanticObject.getSourcePort());
		feeder.accept(grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecIDTerminalRuleCall_7_0_1(), semanticObject.getTargetSystem());
		feeder.accept(grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortDecIDTerminalRuleCall_9_0_1(), semanticObject.getTargetPort());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns SystemDec
	 *     SystemDec returns SystemDec
	 *
	 * Constraint:
	 *     (name=QualifiedName sysFeatures+=AbstractFeatures*)
	 */
	protected void sequence_SystemDec(ISerializationContext context, SystemDec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractFeatures returns SystemPortIn
	 *     SystemPortDec returns SystemPortIn
	 *     SystemPortIn returns SystemPortIn
	 *
	 * Constraint:
	 *     (name=QualifiedName inComp=[ComponentImpl|ID] inPort=[Port|ID])
	 */
	protected void sequence_SystemPortIn(ISerializationContext context, SystemPortIn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.ABSTRACT_FEATURES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.ABSTRACT_FEATURES__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.SYSTEM_PORT_IN__IN_COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.SYSTEM_PORT_IN__IN_COMP));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.SYSTEM_PORT_IN__IN_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.SYSTEM_PORT_IN__IN_PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSystemPortInAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSystemPortInAccess().getInCompComponentImplIDTerminalRuleCall_3_0_1(), semanticObject.getInComp());
		feeder.accept(grammarAccess.getSystemPortInAccess().getInPortPortIDTerminalRuleCall_5_0_1(), semanticObject.getInPort());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractFeatures returns SystemPortOut
	 *     SystemPortDec returns SystemPortOut
	 *     SystemPortOut returns SystemPortOut
	 *
	 * Constraint:
	 *     (name=QualifiedName outComp=[ComponentImpl|ID] outPort=[Port|ID])
	 */
	protected void sequence_SystemPortOut(ISerializationContext context, SystemPortOut semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.ABSTRACT_FEATURES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.ABSTRACT_FEATURES__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.SYSTEM_PORT_OUT__OUT_COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.SYSTEM_PORT_OUT__OUT_COMP));
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.SYSTEM_PORT_OUT__OUT_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.SYSTEM_PORT_OUT__OUT_PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSystemPortOutAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSystemPortOutAccess().getOutCompComponentImplIDTerminalRuleCall_3_0_1(), semanticObject.getOutComp());
		feeder.accept(grammarAccess.getSystemPortOutAccess().getOutPortPortIDTerminalRuleCall_5_0_1(), semanticObject.getOutPort());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     errorModes returns errorModes
	 *
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_errorModes(ISerializationContext context, errorModes semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentModelPackage.Literals.ERROR_MODES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModelPackage.Literals.ERROR_MODES__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getErrorModesAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}