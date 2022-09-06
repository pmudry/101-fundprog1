# Conversion from GFM markdown to PDF
This toolchain uses [pandoc](https://pandoc.org/) for doing the heavy lifting in converting `markdown` to `pdf` using Latex. A template for the module descriptor has been made, the conversion is fast and can be made in batch. Based on [the Wandmalfarbe](https://github.com/Wandmalfarbe/pandoc-latex-template) solution.

The advantage of this solution resides in 
- its speed
- the fact that variables can be defined at the beginning of the `md` module file using YAML. The variables are then passed to Latex and can be used in the template for further processing.
- the output is PDF

## Installing
Prerequisites:
```
apt install parallel rename pandoc
apt install texlive-full
```
# Generating a pdf module description from MD

## Testing
TODO explain how to test on a dedicated machine

## Automation CI/CD
- [ ] integrate this into github
- [x] do this for every file
- [ ] devise a way to lock files once a year, archive the content and push it to the ISC website.
 
# Pipeline to create
- [x] Check the MD using the `javascript` parser `remark`. This should check that all the required content is there (required titles etc...). Done with `JSON Schema`
- [x] Pass the output of the parsed file to `pandoc`, create the corresponding file and move it to `generated_outputs` directory. 


