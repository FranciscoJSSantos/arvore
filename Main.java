class Main {
    public static void main(String[] args) {

        Node rootNode = new Node("A");  
        rootNode.setLeftNode(new Node("B"));
        rootNode.setRightNode(new Node("D"));
        rootNode.left.setLeftNode(new Node("E"));
        rootNode.left.setRightNode(new Node("F"));
        rootNode.left.left.setLeftNode(new Node("H"));
        rootNode.right.setLeftNode(new Node("G"));


        System.out.println("---------------------------");
        System.out.println("");

        //Retorna true se for folha e false se não for;
        System.out.println("Nó folha:" + rootNode.isLeaf());
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");

        //Retorna o grau do nó
        System.out.println("Grau:" + rootNode.getDegree());
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");

        //Retorna o altura do nó
        System.out.println("Altura: " + rootNode.getHeight());
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");

        //Retorna o profundidade do nó
        System.out.println("Profundidade:" + rootNode.getDepth());
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");

        //Retorna o Nível do nó
        System.out.println("Nível:" + rootNode.getLevel());
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");

        //Retorna as Subárvores do nó
        System.out.print("Sub-Árvores:\n " + rootNode.getSubTree());
     

     /*
        a) A Raiz e os nós - V
        b) Nós folhas - V
        c) O grau de cada nó - V
        d) A altura de cada nó - V
        e) A profundidade de cada nó - V
        f) Os níveis de cada nó - V
        g) As subárvores de cada nó - V
     */
      
      }
  }