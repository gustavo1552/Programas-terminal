import pytesseract as ocr
import base64

from PIL import Image
ocr.pytesseract.tesseract_cmd = r'C:\\Users\\Admin\\AppData\\Local\\Tesseract-OCR\\tesseract.exe'

phrase = ocr.image_to_string(Image.open(r'C:\\Users\\Admin\\Desktop\\geladeira\\dec2.png'), lang='por')
print(phrase)
#file = open("dec.rtf","w")
#file.write(str(phrase.encode('utf-8')))

text_file = open("dec.rtf", "w")
text_file = text_file.write(phrase)
