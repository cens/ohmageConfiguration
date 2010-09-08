//
// Generated by JTB 1.3.2
//

package org.andwellness.config.grammar.syntaxtree;

/**
 * The interface which all syntax tree classes must implement.
 */
public interface Node extends java.io.Serializable {
   public void accept(org.andwellness.config.grammar.visitor.Visitor v);
   public <R,A> R accept(org.andwellness.config.grammar.visitor.GJVisitor<R,A> v, A argu);
   public <R> R accept(org.andwellness.config.grammar.visitor.GJNoArguVisitor<R> v);
   public <A> void accept(org.andwellness.config.grammar.visitor.GJVoidVisitor<A> v, A argu);
}
