# Day 12 – StringBuilder & StringBuffer Practice

## 📅 Date
July 29, 2025

## 🎯 Goal
Deepen understanding of Java’s mutable string classes:
- StringBuilder
- StringBuffer

## ✅ Tasks Completed

1. *Capacity & Initialization*  
   - Created StringBuilder and StringBuffer instances  
   - Printed initial .capacity()

2. *Insertion & Modification*  
   - Used .insert(offset, str) to add text at arbitrary positions  
   - Used .setCharAt(index, ch) to replace specific characters

3. *Deletion*  
   - .delete(start, end) to remove a range of characters  
   - .deleteCharAt(index) to remove a single character

4. *Appending*  
   - .append(...) to add text at the end of the buffer

5. *Reversing*  
   - Called .reverse() twice to verify behavior  

6. *Subsequence & Replace*  
   - Extracted a substring via .subSequence(start, end)  
   - Replaced a range of characters via .replace(start, end, str)

7. *Length Adjustment & Comparison*  
   - .setLength(n) to truncate or pad the buffer  
   - Checked equality with .equals(...)

## 🖥 How to Run

1. Clone or download this folder.
2. Navigate to the project directory in your terminal.
3. Compile:
   ```bash
   javac StringBufferDemo.java StringBuilders.java 
