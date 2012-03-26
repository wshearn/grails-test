import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_myappindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createClosureForHtmlPart(2, 2)
invokeTag('captureTitle','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',82,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',84,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
invokeTag('meta','g',88,['name':("app.version")],-1)
printHtmlPart(7)
invokeTag('meta','g',89,['name':("app.grails.version")],-1)
printHtmlPart(8)
codecOut.print(org.codehaus.groovy.runtime.InvokerHelper.getVersion())
printHtmlPart(9)
codecOut.print(System.getProperty('java.version'))
printHtmlPart(10)
codecOut.print(grails.util.Environment.reloadingAgentEnabled)
printHtmlPart(11)
codecOut.print(grailsApplication.controllerClasses.size())
printHtmlPart(12)
codecOut.print(grailsApplication.domainClasses.size())
printHtmlPart(13)
codecOut.print(grailsApplication.serviceClasses.size())
printHtmlPart(14)
codecOut.print(grailsApplication.tagLibClasses.size())
printHtmlPart(15)
for( plugin in (applicationContext.getBean('pluginManager').allPlugins) ) {
printHtmlPart(16)
codecOut.print(plugin.name)
printHtmlPart(17)
codecOut.print(plugin.version)
printHtmlPart(18)
}
printHtmlPart(19)
for( c in (grailsApplication.controllerClasses.sort { it.fullName }) ) {
printHtmlPart(20)
createTagBody(3, {->
codecOut.print(c.fullName)
})
invokeTag('link','g',116,['controller':(c.logicalPropertyName)],3)
printHtmlPart(21)
}
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',121,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1332782743000L
public static final String DEFAULT_CODEC = null
}
