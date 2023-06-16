import kotlin.String

fun main(){
    var myStack=Stack()
    myStack.push(67)
    myStack.push(32)
    myStack.push(45)
    println(myStack.peek())
    myStack.pop()
    myStack.push(18)
    var x=myStack.pop()
    var y=myStack.pop()
    var z=x!!+y!!
    println(z)

// Class2   
    var final=Strings()
    var word="hello"
    for(x in word){

    }
    var result= mutableListOf<Char>()
    while(!final.isEmpty()){
      result.add(final.pop()!!)
    }
    println(result.joinToString (""))

}
class Stack{
    var data= mutableListOf<Int>()

//    Adding element to my stack
    fun push(value: Int){
        data.add(value)
    }

//    Removing element in stack LIFO
    fun pop():Int?{
      if(data.isEmpty()) {
          return null
      }

    var top=data[data.lastIndex]
    data.removeAt(data.lastIndex)
    return top
    }
//This shows element at the top
    fun peek():Int?{
        if(data.isEmpty()) {
            return null
        }
        return data[data.lastIndex]

    }
    fun isEmpty():Boolean{
        return  data.isEmpty()
    }

}
class Strings{
    var data= mutableListOf<Char>()

    //    Adding element to my stack
    fun push(value: Char){
        data.add(value)
    }

    //    Removing element in stack LIFO
    fun pop():Char?{
        if(data.isEmpty()) {
            return null
        }

        var top=data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }
    //This shows element at the top
    fun peek():Char?{
        if(data.isEmpty()) {
            return null
        }
        return data[data.lastIndex]

    }
    fun isEmpty():Boolean{
        return  data.isEmpty()
    }

}



















