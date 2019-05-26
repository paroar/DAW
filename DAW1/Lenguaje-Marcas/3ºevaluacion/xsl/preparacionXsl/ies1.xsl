<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  
<xsl:template match="/">
<html>
<body>

<h1><xsl:value-of select="/ies/@nombre"/></h1>
<ol>
    <xsl:for-each select="ies/ciclos/ciclo">
    <xsl:sort order="descending" select="nombre"/>
    <li><xsl:value-of select="nombre"/> (<xsl:value-of select="grado"/>)</li>
    </xsl:for-each>
</ol>

<table>
<tr><th>Ciclo</th><th>Año</th></tr>
<xsl:for-each select="ies/ciclos/ciclo">
<tr><td><xsl:value-of select="@id"/></td><td>
<xsl:if test="decretoTitulo/@año &gt; 2009">
<p style="color: green;"><xsl:value-of select="decretoTitulo/@año"/></p>
</xsl:if>
<xsl:if test="decretoTitulo/@año &lt; 2009">
<p style="color: red;"><xsl:value-of select="decretoTitulo/@año"/></p>
</xsl:if>
<xsl:if test="decretoTitulo/@año = 2009">
<p style="color: blue;"><xsl:value-of select="decretoTitulo/@año"/></p>
</xsl:if>
</td></tr>
</xsl:for-each>
</table>



</body> 
</html>
</xsl:template>

</xsl:stylesheet>
