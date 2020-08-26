class LinkedList{

    private var head:Node?=null
    private var tail:Node?=null
    private var size=0

    private inner class Node constructor(internal var data:Int, internal var next:Node?)
    fun append(data:Int)
    {
        val oldHead=head
        val newNode=Node(data,next = null)
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

    fun search(data:Int)
    {
        var tempHead=head
        while (tempHead!=null)
        {
            if(tempHead.data==data)
            {
                println("$data exists in list")
                return
            }
            tempHead=tempHead.next
        }
        println("$data does not exist in list")
        return
    }

    //get the size of entire list
    fun getSize():Int{
        return size
    }

    //get all the elements of list
    fun getAll()
    {
       var tempHead=head
       while(tempHead!=null)
        {
            println(tempHead?.data)
            tempHead=tempHead?.next
        }

    }

    fun delete(data: Int)
    {
        var current=head
        var  prevCurrent=current
        while (current!=null)
        {

            if(current.data==data)
            {
                prevCurrent?.next=current.next
                println("$data deleted from list")
                size--
                return
            }
            prevCurrent=current
            current=current.next
        }
        println("$data does not exist in list")
        return

    }

}

fun main()
{
    var linkedList=LinkedList()
     linkedList.append(142)
    linkedList.append(152)
    linkedList.append(132)
    linkedList.append(122)

    linkedList.getAll()
    println(" ")

    linkedList.search(122)
    println(" ")

    linkedList.delete(122)
    println(" ")
    linkedList.getAll()
}
