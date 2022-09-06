#!/bin/bash
# pandoc ../../template/template_module.md -o test.pdf --from markdown+tex_math_dollars --template=iscmodule.tex --listings --lua-filter=meta-vars.lua 

# Set variables
file="lab01/lab1-intro.md"

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

input="${file}"
output="out/${file}.pdf"
echo "Processing with file '${input}'"

pandoc "${input}" -o "${output}" --from markdown+tex_math_dollars+raw_tex --template=iscmodule.tex --listings -V colorlinks --number-sections --lua-filter=lua_filters/attrib-colors.lua --metadata=DRAFT:false

echo "Output generated in ${output}"
