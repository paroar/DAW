for $x in doc("bib.xml")//libro
order by $x/@anyo
return ($x/titulo/text(), $x/@anyo)
