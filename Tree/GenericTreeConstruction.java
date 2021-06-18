import java.util.*;
public class GenericTreeConstruction{

    public static void main(String[] args)
    {

     //int[] input ={10,20,-1,30,40,50,60,-1,-1,-1,70,-1,-1};
     int[] input ={10,20,-1,30,50,-1,60,-1,-1,40,-1,-1};
         Node root = ConstructGenerictree(input);
      display(root);
      /*
10--->20  30  40  
20--->
30--->50  60
50--->
60--->
40---> */
    }

    public static class Node{
        
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(int data)
        {
            this.data = data;
        }
    }

    public static Node ConstructGenerictree(int[] input)
    {
        Stack<Node> st = new Stack<>();
        Node root = new Node(input[0]);
        st.push(root);

        for(int i=1;i<input.length;i++)
        {
           int val = input[i];
           if(val==-1)
            st.pop();
           else
           {  Node newnode = new Node(val);
                st.peek().children.add(newnode);
                st.push(newnode);
           }            


        }

        return root;
     
     }

     public static void display(Node node)
     {
         System.out.print(node.data +"--->");

         for(Node child : node.children)
         {
            System.out.print(child.data +"  ");
         }
         System.out.println();
         for(Node child : node.children)
         {
            display(child);
         }
         

     }

}