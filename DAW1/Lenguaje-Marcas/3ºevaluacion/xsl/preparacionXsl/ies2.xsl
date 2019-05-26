<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
  
  <html>
<body>

  <ol>
  <xsl:for-each select="bib/libro">
  <xsl:sort select="autor/apellido"/>
  <xsl:for-each select="autor">  
  <li><xsl:value-of select="nombre"/><xsl:value-of select="apellido"/></li>
  </xsl:for-each>
  </xsl:for-each>
  </ol>
  
  <ol>
<xsl:for-each select="bib/libro">
<xsl:sort select="precio"/>
<xsl:if test="precio &lt; 100">
<li><xsl:value-of select="titulo"/></li>
</xsl:if>
</xsl:for-each>
  </ol>
  
  <table>
<tr><th>Precio</th><th>Título</th><th>Año</th></tr>
<xsl:for-each select="bib/libro">
<xsl:sort select="precio" data-type="number"/>
<tr>
<td><xsl:value-of select="precio"/></td>
<xsl:choose>
<xsl:when test="precio &gt; 100">
<td><span style="color: red;"><xsl:value-of select="titulo"/></span></td>
</xsl:when>
<xsl:otherwise>
<td><xsl:value-of select="titulo"/></td>
</xsl:otherwise>
</xsl:choose>
<td><span style="font-style: italic;"><xsl:value-of select="@año"/></span></td>
</tr>
</xsl:for-each>
  </table>

<table>
<tr><th>Título</th><th>Autores</th><th>Editores</th></tr>
<xsl:for-each select="bib/libro">

<xsl:sort select="precio"/>
<tr>
<xsl:choose>
<xsl:when test="precio &gt; 100">
<td><span style="color: red;"><xsl:value-of select="titulo"/>(caro)</span></td>
</xsl:when>
<xsl:otherwise>
<td><xsl:value-of select="titulo"/></td>
</xsl:otherwise>
</xsl:choose>

<td>
<xsl:for-each select="autor">
<xsl:value-of select="nombre"/><xsl:value-of select="apellido"/>
</xsl:for-each>
</td>
</tr>
</xsl:for-each>
</table>

</body>  
  </html>
  
  </xsl:template>
</xsl:stylesheet>
