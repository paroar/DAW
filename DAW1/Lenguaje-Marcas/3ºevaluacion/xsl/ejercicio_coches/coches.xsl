<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html>
    <body>
      <table border="1px solid black">
        <tr bgcolor="yellow">
          <th>Nombre</th>
          <th>Modelo</th>
          <th>Fabricación</th>
          <th>Modificaciones</th>
        </tr>
        <xsl:for-each select="vehiculos/vehiculo">
          <tr>
            <td><xsl:value-of select="nombre"/></td>
            <td><xsl:value-of select="modelo"/></td>
            <td><xsl:value-of select="fabricacion/inicio"/></td>
            <td><xsl:for-each select="modificaciones/modificacion">
              <tr><xsl:value-of select="."/></tr>
            </xsl:for-each></td>
          </tr>
        </xsl:for-each>
      </table>
    </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
