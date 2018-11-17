// CS 0445 Spring 2018// Assignment 4// Interface for the additional operations in the ComparableBinaryTree//package MyTreePackage;public class ComparableBinaryTree<T extends Comparable<? super T>> extends BinaryTree<T> implements ComparableTreeInterface<T>{	// If the tree is not empty, return the maximum
	// value in the tree; otherwise return null
	public T getMax(){			}	
	// If the tree is not empty, return the minimum
	// value in the tree; otherwise return null
	public T getMin(){			}	
	// Return true if the the tree meets the
	// recursive definition of a BST; else
	// return false	public boolean isBST(){			}		// Return the rank of data in the tree	// with 0 being the smallest answer and	// N being the largest answer.  data does not have to be 	// present in the tree.  If duplicates are present in the tree	// this answer should be minimized.	public int rank(T data){			}  		// Return the value in the tree with rank	// i in the ordering.  If there are duplicates	// the first occurrence should be returned.	public T get(int i){			}	}