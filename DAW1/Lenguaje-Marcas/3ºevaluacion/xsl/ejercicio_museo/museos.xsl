<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

<xsl:template match="/">
  <html>
  <body>
  <h2>Museos de Londres</h2>
    <table border="1">
      <tr>
        <th style="text-align:left" bgcolor="cyan">Museo</th>
      </tr>
      <xsl:for-each select="ciudades/ciudad">
        <xsl:if test="@nombre='Londres'">
          <tr>
            <td><xsl:value-of select="museo"/></td>
          </tr>
        </xsl:if>
      </xsl:for-each>
    </table>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>