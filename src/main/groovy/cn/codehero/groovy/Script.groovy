/**
 * groovy的script
 * 每一个脚本都会生成一个static main函数。
 * 这样，当我们groovy test.groovy的时候，其实就是用java去执行这个main函数
 * 如果脚本中定义了函数，则函数会被定义在test类中。
 * @author eleven
 */

	println "Hello Groovy World"
