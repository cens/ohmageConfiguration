//
// Generated by JTB 1.3.2
//

package org.andwellness.config.grammar.visitor;
import org.andwellness.config.grammar.syntaxtree.NodeList;
import org.andwellness.config.grammar.syntaxtree.NodeListOptional;
import org.andwellness.config.grammar.syntaxtree.NodeOptional;
import org.andwellness.config.grammar.syntaxtree.NodeSequence;
import org.andwellness.config.grammar.syntaxtree.NodeToken;
import org.andwellness.config.grammar.syntaxtree.condition;
import org.andwellness.config.grammar.syntaxtree.conjunction;
import org.andwellness.config.grammar.syntaxtree.expr;
import org.andwellness.config.grammar.syntaxtree.id;
import org.andwellness.config.grammar.syntaxtree.sentence;
import org.andwellness.config.grammar.syntaxtree.sentence_prime;
import org.andwellness.config.grammar.syntaxtree.start;
import org.andwellness.config.grammar.syntaxtree.value;

/**
 * All GJ visitors must implement this interface.
 */

public interface GJVisitor<R,A> {

   //
   // GJ Auto class visitors
   //

   public R visit(NodeList n, A argu);
   public R visit(NodeListOptional n, A argu);
   public R visit(NodeOptional n, A argu);
   public R visit(NodeSequence n, A argu);
   public R visit(NodeToken n, A argu);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> sentence()
    * f1 -> <EOF>
    */
   public R visit(start n, A argu);

   /**
    * f0 -> expr() sentence_prime()
    *       | "(" sentence() ")" sentence_prime()
    */
   public R visit(sentence n, A argu);

   /**
    * f0 -> ( conjunction() sentence() sentence_prime() )?
    */
   public R visit(sentence_prime n, A argu);

   /**
    * f0 -> id()
    * f1 -> condition()
    * f2 -> value()
    */
   public R visit(expr n, A argu);

   /**
    * f0 -> <TEXT>
    */
   public R visit(id n, A argu);

   /**
    * f0 -> "=="
    *       | "!="
    *       | "<"
    *       | ">"
    *       | "<="
    *       | ">="
    */
   public R visit(condition n, A argu);

   /**
    * f0 -> <TEXT>
    */
   public R visit(value n, A argu);

   /**
    * f0 -> "and"
    *       | "or"
    */
   public R visit(conjunction n, A argu);

}