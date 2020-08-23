class LinkedList<E>{

    private var head:Node<E>?=null
    private var tail:Node<E>?=null
    private var size=0

    private inner class Node<E> constructor(internal var element:E, internal var next:Node<E>?)

  /*  fun addFirst(element:E)
    {
        val oldHead=head
        val newNode=Node<E>(element,oldHead)
        head=newNode
        if(oldHead==null)
        {
            tail=newNode
        }
        size++

    }*/

    fun append(element:E)
    {
        val oldHead=head
        val newNode=Node<E>(element,next = null)
    //This if will execute if there is already no element in linked list
        if(head==null)
        {
            head=newNode
            tail=newNode
            size++
        }
        //If list already has one element than this part will execute
        else{

            var oldTail=tail
            //Tail now points to newly added node, because now it's the last node
            tail=newNode
            //Pointing the next of 2nd last node (last node before adding the new node) to new node added
            oldTail?.next=newNode

            size++
        }
    }
    //get the size of entire list
    fun getSize():Int{
        return size
    }
    //get the first element of list
    fun getFirst() = head?.element

    //get last element of list
    fun getLast() = tail?.element

    //get all the elements of list
    fun getAll()
    {
       var tempHead=head
       while(tempHead!=null)
        {
            println(tempHead?.element)
            tempHead=tempHead?.next
        }

    }
/*    fun addLast(element: E) {
        val t = tail
        val newNode = Node<E>(element, null)
        tail = newNode
        if (t == null) {
            head = newNode
        } else {
            t.next = newNode
        }
        size++
    }*/
}

fun main()
{
    var linkedList=LinkedList<Int>()
 linkedList.append(142)
    linkedList.append(152)
    linkedList.append(132)
    linkedList.append(122)

    linkedList.getAll()
}
