<%@ page import="secret.happiness.Author" %>



<div class="fieldcontain ${hasErrors(bean: authorInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="author.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${authorInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: authorInstance, field: 'website', 'error')} ">
	<label for="website">
		<g:message code="author.website.label" default="Website" />
		
	</label>
	<g:textField name="website" value="${authorInstance?.website}"/>
</div>

