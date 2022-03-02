public class Node {

  public int level;
  protected Node left, right;
  public Object value;

  Node(Object value) {
    this.level = 0;
    this.value = value;
  }

  public void setLeftNode(Node leftNode) {
    leftNode.level = this.level + 1;
    this.left = leftNode;
  }

  public void setRightNode(Node rightNode) {
    rightNode.level = this.level + 1;
    this.right = rightNode;
  }

  public int getLevel() {
    return this.level;
  }

  public int getBigger(int a, int b) {
    if (a > b) {
      return a;
    }
    return b;
  }

  // é diferente
  public int getHeight() {
    int leftCounter = 0;
    int rightCounter = 0;
    // System.out.println("level:: " + this.level);
    if (this.right == null && this.left == null) {
    //   System.out.println("1");
      //1
      return 0;
    } else if(this.left != null && this.right != null) {
      leftCounter += this.left.getHeight();
      rightCounter += this.right.getHeight();
    //   System.out.println("2");
      return 1 + getBigger(leftCounter, rightCounter);
      //2
    } else if (this.left != null && this.right == null) {
      leftCounter += this.left.getHeight();
    //   System.out.println("left:: " + leftCounter);
    //   System.out.println("3");
      return 1 + this.left.getHeight();
      //3
    } else {
      rightCounter += this.right.getHeight();
    //   System.out.println("right:: " + rightCounter);
    //   System.out.println("4");
      return 1 + this.right.getHeight();
      //4
    }
  }

  public String getSubTree() {
    String leftCounter = "";
    String rightCounter = "";
    // System.out.println("level:: " + this.level);
    if (this.right == null && this.left == null) {
    //   System.out.println("1");
      //1
      return this.value.toString();
    } else if(this.left != null && this.right != null) {
      leftCounter = this.left.getSubTree() + "\t" + this.value.toString();
      rightCounter = leftCounter + "\n" + this.right.getSubTree();
    //   System.out.println("2");
    //   System.out.println(rightCounter);
      // return 1 + getBigger(leftCounter, rightCounter);
      return leftCounter + "\n" + this.right.getSubTree();
      //2
    } else if (this.left != null && this.right == null) {
      leftCounter += this.left.getSubTree() + "\t" + this.value.toString();
    //   System.out.println("left:: " + leftCounter);
    //   System.out.println("3");
      return this.left.getSubTree() + "\t" + this.value.toString();
      //3
    } else {
      rightCounter += this.right.getSubTree() + "\t" + this.value.toString();
    //   System.out.println("right:: " + rightCounter);
    //   System.out.println("4");
      return this.right.getSubTree() + "\t" + this.value.toString();
      
      //4
    }
  }

  public int getDepth() {
    return this.level;
  }

  public int getDegree() {
    if (this.left == null && this.right == null) {
      return 0;
    } else if (this.left != null && this.right != null) {
      return 2;
    } else {
      return 1;
    }
  }

  public boolean isLeaf() {
    return (this.left == null && this.right == null);
  }

}