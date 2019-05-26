<html>
  <body>
    <h1>Listado de libros</h1>
    <table border="1">
      <tr>
        <th align="left">título</th>
        <th align="left">editorial</th>
        <th align="rigth">precio</th>
      </tr>
      {
        for $x in doc("bib.xml")/bib/libro
        return 
              <tr>
                <td align="left">{data($x/titulo)}</td>
                <td align="left">{data($x/editorial)}</td>
                <td align="rigth">{data($x/precio)}</td>
              </tr>
      } 
    </table>
  </body>
</html>