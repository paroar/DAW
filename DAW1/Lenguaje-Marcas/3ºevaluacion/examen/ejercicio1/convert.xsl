<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
  
  <html>
  <link rel="stylesheet" type="text/css" href="style.css"/>
  <script type="text/javascript" src="js.js"/>
  <body>
  
  
  <h3>SURF</h3>
<xsl:for-each select="cursos/curso">
  <xsl:if test="nombre = 'Surf'">
  <div>
    <p class="head"><xsl:value-of select="precio"/> persona</p>

      <p><xsl:value-of select="dias"/> dias</p>
      <p><xsl:value-of select="horas"/> horas de duracion</p>
      <p>Material <xsl:value-of select="material"/></p>
  </div>
</xsl:if>
</xsl:for-each>
  
  
  <h3>BODYBOARD</h3>
<xsl:for-each select="cursos/curso">
  <xsl:if test="nombre = 'Bodyboard'">
   <div>
    <p class="head"><xsl:value-of select="precio"/> persona</p>

      <p><xsl:value-of select="dias"/> dias</p>
      <p><xsl:value-of select="horas"/> horas de duracion</p>
      <p>Material <xsl:value-of select="material"/></p>
 
  </div>
</xsl:if>
</xsl:for-each>
</body>  
  </html>
  
  </xsl:template>
</xsl:stylesheet>
