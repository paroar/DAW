<html>
<body>
  <h1>Libros de Stevens</h1>
  <table border="1">
    <tr>
      <td>Título</td>
      <td>Precio</td>
    </tr>
  {
  for $x in doc("bib.xml")/bib/libro
  where $x/autor/apellido = "Stevens"
  return <tr><td>{string($x/titulo)}</td><td>{string($x/precio)}</td></tr>
  }
    <tr>
      <td>Precio total</td>
      <td>{
          let $b:= (
                    for $a in doc("bib.xml")//libro
                    where $a/autor/apellido = "Stevens"
                    return $a/precio
                   )
          return sum($b)
          }
      </td>
    </tr>
  </table>
</body>
</html>