/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.scoping;

import com.google.common.base.Objects;
import hu.bme.mit.componentModel.CompConnDec;
import hu.bme.mit.componentModel.ComponentImpl;
import hu.bme.mit.componentModel.ComponentModelPackage;
import hu.bme.mit.componentModel.ComponentType;
import hu.bme.mit.componentModel.InPort;
import hu.bme.mit.componentModel.OutPort;
import hu.bme.mit.componentModel.PortType;
import hu.bme.mit.componentModel.SystemConnDec;
import hu.bme.mit.componentModel.SystemDec;
import hu.bme.mit.componentModel.SystemPortDec;
import hu.bme.mit.componentModel.SystemPortIn;
import hu.bme.mit.componentModel.SystemPortOut;
import hu.bme.mit.scoping.AbstractComponentModelScopeProvider;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class ComponentModelScopeProvider extends AbstractComponentModelScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xblockexpression = null;
    {
      if ((context instanceof CompConnDec)) {
        final CompConnDec conn = ((CompConnDec) context);
        boolean _equals = Objects.equal(reference, ComponentModelPackage.Literals.COMP_CONN_DEC__SOURCE_PORT);
        if (_equals) {
          ComponentImpl _sourceComp = conn.getSourceComp();
          final ComponentImpl compI = EcoreUtil2.<ComponentImpl>getContainerOfType(_sourceComp, ComponentImpl.class);
          boolean _equals_1 = Objects.equal(compI, null);
          if (_equals_1) {
            return IScope.NULLSCOPE;
          }
          final ComponentType compT = compI.getSuperType();
          final List<OutPort> ports = EcoreUtil2.<OutPort>getAllContentsOfType(compT, OutPort.class);
          boolean _equals_2 = Objects.equal(ports, null);
          if (_equals_2) {
            return IScope.NULLSCOPE;
          } else {
            return Scopes.scopeFor(ports);
          }
        }
        boolean _equals_3 = Objects.equal(reference, ComponentModelPackage.Literals.COMP_CONN_DEC__TARGET_PORT);
        if (_equals_3) {
          ComponentImpl _targetComp = conn.getTargetComp();
          final ComponentImpl compI_1 = EcoreUtil2.<ComponentImpl>getContainerOfType(_targetComp, ComponentImpl.class);
          boolean _equals_4 = Objects.equal(compI_1, null);
          if (_equals_4) {
            return IScope.NULLSCOPE;
          }
          final ComponentType compT_1 = compI_1.getSuperType();
          final List<InPort> ports_1 = EcoreUtil2.<InPort>getAllContentsOfType(compT_1, InPort.class);
          boolean _equals_5 = Objects.equal(ports_1, null);
          if (_equals_5) {
            return IScope.NULLSCOPE;
          } else {
            final ArrayList<InPort> sourceTypePort = CollectionLiterals.<InPort>newArrayList();
            for (final InPort port : ports_1) {
              PortType _superType = port.getSuperType();
              OutPort _sourcePort = conn.getSourcePort();
              PortType _superType_1 = _sourcePort.getSuperType();
              boolean _equals_6 = Objects.equal(_superType, _superType_1);
              if (_equals_6) {
                sourceTypePort.add(port);
              }
            }
            boolean _notEquals = (!Objects.equal(sourceTypePort, null));
            if (_notEquals) {
              return Scopes.scopeFor(sourceTypePort);
            }
          }
        }
      }
      if ((context instanceof SystemPortIn)) {
        final SystemPortIn inPortDec = ((SystemPortIn) context);
        boolean _equals_7 = Objects.equal(reference, ComponentModelPackage.Literals.SYSTEM_PORT_IN__IN_PORT);
        if (_equals_7) {
          ComponentImpl _inComp = inPortDec.getInComp();
          final ComponentImpl compI_2 = EcoreUtil2.<ComponentImpl>getContainerOfType(_inComp, ComponentImpl.class);
          boolean _equals_8 = Objects.equal(compI_2, null);
          if (_equals_8) {
            return IScope.NULLSCOPE;
          }
          final ComponentType compT_2 = compI_2.getSuperType();
          final List<InPort> ports_2 = EcoreUtil2.<InPort>getAllContentsOfType(compT_2, InPort.class);
          boolean _equals_9 = Objects.equal(ports_2, null);
          if (_equals_9) {
            return IScope.NULLSCOPE;
          } else {
            return Scopes.scopeFor(ports_2);
          }
        }
      }
      if ((context instanceof SystemPortOut)) {
        final SystemPortOut inPortDec_1 = ((SystemPortOut) context);
        boolean _equals_10 = Objects.equal(reference, ComponentModelPackage.Literals.SYSTEM_PORT_OUT__OUT_PORT);
        if (_equals_10) {
          ComponentImpl _outComp = inPortDec_1.getOutComp();
          final ComponentImpl compI_3 = EcoreUtil2.<ComponentImpl>getContainerOfType(_outComp, ComponentImpl.class);
          boolean _equals_11 = Objects.equal(compI_3, null);
          if (_equals_11) {
            return IScope.NULLSCOPE;
          }
          final ComponentType compT_3 = compI_3.getSuperType();
          final List<OutPort> ports_3 = EcoreUtil2.<OutPort>getAllContentsOfType(compT_3, OutPort.class);
          boolean _equals_12 = Objects.equal(ports_3, null);
          if (_equals_12) {
            return IScope.NULLSCOPE;
          } else {
            return Scopes.scopeFor(ports_3);
          }
        }
      }
      if ((context instanceof SystemConnDec)) {
        final SystemConnDec conn_1 = ((SystemConnDec) context);
        boolean _equals_13 = Objects.equal(reference, ComponentModelPackage.Literals.SYSTEM_CONN_DEC__SOURCE_PORT);
        if (_equals_13) {
          SystemDec _sourceSystem = conn_1.getSourceSystem();
          final SystemDec systemD = EcoreUtil2.<SystemDec>getContainerOfType(_sourceSystem, SystemDec.class);
          boolean _equals_14 = Objects.equal(systemD, null);
          if (_equals_14) {
            return IScope.NULLSCOPE;
          }
          final List<SystemPortDec> ports_4 = EcoreUtil2.<SystemPortDec>getAllContentsOfType(systemD, SystemPortDec.class);
          boolean _equals_15 = Objects.equal(ports_4, null);
          if (_equals_15) {
            return IScope.NULLSCOPE;
          } else {
            return Scopes.scopeFor(ports_4);
          }
        }
      }
      if ((context instanceof SystemConnDec)) {
        final SystemConnDec conn_2 = ((SystemConnDec) context);
        boolean _equals_16 = Objects.equal(reference, ComponentModelPackage.Literals.SYSTEM_CONN_DEC__TARGET_PORT);
        if (_equals_16) {
          SystemDec _targetSystem = conn_2.getTargetSystem();
          final SystemDec systemD_1 = EcoreUtil2.<SystemDec>getContainerOfType(_targetSystem, SystemDec.class);
          boolean _equals_17 = Objects.equal(systemD_1, null);
          if (_equals_17) {
            return IScope.NULLSCOPE;
          }
          final List<SystemPortDec> ports_5 = EcoreUtil2.<SystemPortDec>getAllContentsOfType(systemD_1, SystemPortDec.class);
          boolean _equals_18 = Objects.equal(ports_5, null);
          if (_equals_18) {
            return IScope.NULLSCOPE;
          } else {
            return Scopes.scopeFor(ports_5);
          }
        }
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
}
