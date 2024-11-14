package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;

import edu.grinnell.csc207.util.BinaryTree;

/**
 * A place to experiment with binary trees.
 */
public class BinaryTreeExperiments {

  // +------+--------------------------------------------------------
  // | Main |
  // +------+

  /**
   * Run our experiments.
   *
   * @param args
   *   Command-line arguments (currently ignored).
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);

    String[] strings = {"aardvark", "billygoat", "chinchilla", "dingo", "emu",
        "frog", "gnu", "hippo", "iguana", "jackalope", "koala", "llama"};
    BinaryTree<String> tree = new BinaryTree<String>(strings);

    tree.dump(pen);
    tree.elements01(pen);
    pen.println("");
    tree.elements02(pen);
    pen.println("");
    tree.print(pen);
    pen.close();
  } // main
} // class BinaryTreeExperiments
