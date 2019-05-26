for $x in doc("bib.xml")/bib/libro/autor
order by $x/apellido
return $x/apellido