#!/bin/bash
# pandoc ../../template/template_module.md -o test.pdf --from markdown+tex_math_dollars --template=iscmodule.tex --listings --lua-filter=meta-vars.lua 

# Set variables
file="lab1-intro"

############################################################
# Process the input options. Add options as needed.        #
############################################################
# Get the options
while getopts ":hn:" option; do
   case $option in      
      n) # Enter a file name
         file="$OPTARG"    
         ;;
     \?) # Invalid option
         echo "Error: Invalid option"
         exit;;
   esac
done

input="${file}.md"
output="${file}.pdf"
echo "Processing with file '${input}'"

# pandoc "${input}" -o "${output}" --pdf-engine=xelatex --from markdown+tex_math_dollars+raw_tex --template=iscmodule.tex --highlight-style=kate -V colorlinks --number-sections --lua-filter=lua_filters/attrib-colors.lua --metadata=DRAFT:false

pushd .
cd '../001-Introduction'
pandoc "${input}" -o "${output}" --pdf-engine=xelatex --from markdown+tex_math_dollars+raw_tex --template='../build_tool/isc_lab.tex' --listings -V colorlinks --number-sections --metadata=DRAFT:false

echo "Output generated in ${output}"
popd .