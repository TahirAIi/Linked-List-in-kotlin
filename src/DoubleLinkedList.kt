class DoubleLinkedList{

    private var head: Node?=null
    private var current:Node?=null
    private var size:Int=0

    inner class Node constructor(internal var data:Int,internal var next:Node?, internal var prev:Node?)

    fun append(data:Int)
    {
        var newNode=Node(data,next = null,prev = null)

        if(head==null)
        {
            head=newNode
            newNode.next=null
            newNode.prev=null
        }
        else
        {
            newNode.prev=current
            newNode.next=null
            current?.next=newNode
        }
        current=newNode
        size++
    }

        fun getSize():Int=size

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
    fun delete(data: Int)
    {
        var current=head
        while (current!=null)
        {
            if(current.data==data)
            {
                current.prev?.next=current.next
                println("$data deleted from list")
                size--
                return
            }
            current=current.next
        }
        println("$data does not exist in list")
        return

    }

    fun getAll()
    {
        var temp=head
        while (temp!=null)
        {
            println(temp.data)
            temp=temp.next
        }
    }
}

fun main() {
    var linkedList=DoubleLinkedList()
    linkedList.append(12)
    linkedList.append(34)
    linkedList.append(22)

    linkedList.getAll()
    println("")
    linkedList.search(22)
    println("")
    linkedList.delete(34)
    println("")
    linkedList.getAll()
}
