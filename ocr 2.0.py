import pytesseract as pt
import base64
import os

from PIL import Image



pt.pytesseract.tesseract_cmd = r'C:\\Users\\Admin\\AppData\\Local\\Tesseract-OCR\\tesseract.exe'
def main(): 
    # path for the folder for getting the raw images 
    path =r"C:\\Users\\Admin\\Desktop\\geladeira"
  
    # path for the folder for getting the output 
    tempPath =r"C:\\Users\\Admin\\Desktop\\forno"
  
    # iterating the images inside the folder 
    for imageName in os.listdir(path): 
              
        inputPath = os.path.join(path, imageName) 
        img = Image.open(inputPath) 
  
        # applying ocr using pytesseract for python 
        text = pt.image_to_string(img, lang ="por") 
  
        # for removing the .jpg from the imagePath 
        #imagePath = imagePath[0:-4] 
  
        fullTempPath = os.path.join(tempPath, 'time_'+imageName+".rtf") 
        print(text) 
  
        # saving the  text for every image in a separate .txt file 
        file1 = open(fullTempPath, "w") 
        file1.write(text) 
        file1.close()  
  
if __name__ == '__main__': 
    main() 