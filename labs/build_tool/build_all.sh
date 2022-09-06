#!/bin/bash
# pandoc "${fileName}" -o test.pdf --from markdown+tex_math_dollars --template=iscmodule.tex --listings --number-sections 

echo "Building all PDF files in parallel..."

parallel --progress --bar --eta pandoc {} -f markdown --from markdown+tex_math_dollars+raw_tex --template=iscmodule.tex --listings -V colorlinks --number-sections --lua-filter=lua_filters/attrib-colors.lua --metadata=DRAFT:false -o {.}.pdf ::: ../../modules/generated_modules_as_md/*.md

mv ../../modules/generated_modules_as_md/*.pdf ../../modules/generated_pdf_files/

cp ../../modules/generated_pdf_files/*_fr.pdf ../../outputs/fr/
cp ../../modules/generated_pdf_files/*_de.pdf ../../outputs/de/
cp ../../modules/generated_pdf_files/*_en.pdf ../../outputs/en/
