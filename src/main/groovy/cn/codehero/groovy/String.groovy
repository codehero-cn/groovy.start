package cn.codehero.groovy

/**字符串的使用*/
class String {

	/** 单引号''中的内容严格对应Java中的String，不对$符号进行转义*/
	def singleQuote='I am $ dolloar'  //输出就是I am $ dolloar
	
	/**双引号""的内容则和脚本语言的处理有点像，如果字符中有$号的话，则它会$表达式先求值*/
	def doubleQuoteWithoutDollar = "I am one dollar" //输出 I am one dollar
	def x = 1
	def doubleQuoteWithDollar = "I am $x dolloar" //输出I am 1 dolloar
	
	/** 三个引号'''xxx'''中的字符串支持随意换行 比如*/
	def multieLines = ''' begin
     line  1 
     line  2
     end '''
}
