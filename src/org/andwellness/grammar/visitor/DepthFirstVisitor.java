//
// Generated by JTB 1.3.2
//

package org.andwellness.grammar.visitor;
import org.andwellness.grammar.syntaxtree.*;
import java.util.*;

/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public class DepthFirstVisitor implements Visitor {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public void visit(NodeList n) {
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
         e.nextElement().accept(this);
   }

   public void visit(NodeListOptional n) {
      if ( n.present() )
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
            e.nextElement().accept(this);
   }

   public void visit(NodeOptional n) {
      if ( n.present() )
         n.node.accept(this);
   }

   public void visit(NodeSequence n) {
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
         e.nextElement().accept(this);
   }

   public void visit(NodeToken n) { }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> sentence()
    * f1 -> <EOF>
    */
   public void visit(start n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> expr() sentence_prime()
    *       | "(" sentence() ")" sentence_prime()
    */
   public void visit(sentence n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> ( conjunction() sentence() sentence_prime() )?
    */
   public void visit(sentence_prime n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> id()
    * f1 -> condition()
    * f2 -> value()
    */
   public void visit(expr n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> <TEXT>
    */
   public void visit(id n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "=="
    *       | "!="
    *       | "<"
    *       | ">"
    *       | "<="
    *       | ">="
    */
   public void visit(condition n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <TEXT>
    */
   public void visit(value n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "and"
    *       | "or"
    */
   public void visit(conjunction n) {
      n.f0.accept(this);
   }

}
