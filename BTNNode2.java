public class BTNNode2<E>{
    
    BTNNode2 left, right;
    E data;
    /* Constructor */
    public BTNNode2()
    {
    left = null;
    right = null;
    data = null;
    }
    /* Constructor */
    public BTNNode2(E item)
    {
    left = null;
    right = null;
    data = item;
    }
    /* Function to set left node */
    public void setLeft(BTNNode2 n)
    {
    left = n;
    }
    /* Function to set right node */
    public void setRight(BTNNode2 n)
    {
    right = n;
    }
    /* Function to get left node */
    public BTNNode2 getLeft()
    {
    return left;
    }
    /* Function to get right node */
    public BTNNode2 getRight()
    {
    return right;
    }
    /* Function to set data to node */
    public void setData(E d)
    {
    data = d;
    }
    /* Function to get data from node */
    public E getData()
    {
    return data;
    }
   }
   