File f = new File("gbknative.txt")
def s=f.text
//println s
utext = ""
s.each{
	def num = (int)it
	def uninum = Integer.toHexString(num)
	def ustr = "\\u$uninum"
	if(num>256)
		utext = utext+ustr
	else
		utext = utext + it
	//println ustr
}

println utext