<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
  <html>
  <body>
  <select>
    <xsl:for-each select="ies/ciclos/ciclo">
      <option><xsl:value-of select="nombre"/></option>
    </xsl:for-each>
  </select>        
  </body>  
  </html>
  </xsl:template>
</xsl:stylesheet>
