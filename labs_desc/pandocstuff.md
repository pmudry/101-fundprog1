https://stackoverflow.com/questions/52890081/pandoc-markdown-to-docx-with-cover-page-and-toc-in-separated-pages

pandoc --print-default-data-file reference.docx > custom-reference.docx
pandoc module1.md -o example.docx --reference-doc custom-reference.docx --from markdown+tex_math_dollars

