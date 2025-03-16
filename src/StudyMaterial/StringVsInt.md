## Why use String instead of Int?

-- Non-numeric Data: If the data you are working with is not purely numeric (e.g., names, addresses, or identifiers that 
   include letters and symbols), a string is the appropriate choice.
-- Leading Zeros: If you need to preserve leading zeros (e.g., phone numbers, ZIP codes, or certain types of IDs), an int
   would drop the leading zeros, whereas a string would retain them.
-- Flexibility: Strings can represent a wider range of data formats, including numbers, letters, and special characters. 
   This makes them more flexible for handling diverse data types.
-- Human Readability: Strings are often more human-readable, especially when dealing with codes, identifiers, or mixed 
   data (e.g., "ABC123").
-- No Size Limitation: While int types have a fixed size limit (e.g., 32-bit or 64-bit), strings can handle much larger 
   data, limited only by memory.
-- No Arithmetic Operations Needed: If you don't need to perform arithmetic operations on the data, using a string 
   avoids unnecessary conversions and potential errors.
-- Compatibility: Some systems or APIs require data to be in string format, even if it represents a number (e.g., JSON 
   or XML data).
-- Special Formats: Strings are better for representing data in special formats, such as dates ("2023-10-05"), times, 
   or custom patterns.

Example Scenarios:

-- Phone Numbers: Stored as strings to preserve formatting (e.g., "+1-800-555-1234").
-- Identifiers: Product codes like "A123-XYZ" are best stored as strings.
-- Text Data: Names, addresses, or descriptions are naturally strings.