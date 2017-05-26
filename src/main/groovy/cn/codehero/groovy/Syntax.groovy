/**
 * groovy语法
 * @author eleven
 */
class Syntax {
    
    static void main(args){
   
    /**语句可以不用分号结尾**/    
    print 12
    
    /**变量的定义*/        
    def string = "hello world"   //定义变量 ，可以不指定类型,此时一定要加def
    def String  str1 = "test"    //定义变量，也可以指定类型
    String str2 = "test"          //定义变量，也可以不要def
    
    println string
    println string.class  //是否是String型
    
    /**函数调用的时候可以不加括号*/
    println "test"   //等同于println("test")
    testFunction1()  //此处括号又不能去掉，什么原因?
    }
    
    /**有类型的函数定义,可以不用def关键字*/
    String testFunction(arg1,arg2){ //无需指定参数类型
        print test
        return haha  //返回值也可以是无类型的
    }
    
    /**无类型的函数定义,必须使用def关键字*/
    def  static testFunction1(){
		print "test"    
		1000  //最后一行代码的执行结果就是本函数的返回值
    }
}