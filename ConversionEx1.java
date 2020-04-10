					Data Conversions Techniques
					---------------------------
	parsing				boxing / unboxing			casting
(converting String to		converting primitive type to object	converting any primitive type
  any primitive number 			is called boxing		 to any other primitive type
  type or boolean type)		converting object to primitive type	It has 3 type
					is called unboxing		-- implicit casting (automatic)
	byte								-- explicit casting
	short			boxing					-- mixed casting
	int			int x=48;
String->long			Integer obj=new Integer(x);
	float
	double			double x=48.632;
	boolean			Double obj=new Double(x);
				----------------------------------
Byte.parseByte(str)		<object>.byteValue();
Short.parseShort(str)		<object>.shortValue();
Integer.parseInt(str)		<object>.intValue();
Long.praseLong(str)		<object>.longValue();
Float.parseFloat(str)		<object>.floatValue();
Double.parseDouble(str)		<object>.doubleValue();
Boolean.parseBoolean(str)