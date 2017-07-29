# DataHandler
DataHandler has the following methods: loadPriceData, getPrices, computeAverage, computeMax, computeMovingAverage,insertPrice, correctPrice 

# loadPriceData
loadPriceData: takes the file name, sort method specification (QuickSort or BubbleSort), and sort preference – ascending or descending, and price or date – as parameters. The file content should be loaded into memory and sorted according to the above sort preferences. After this method is called, the data should be held in the instance variables of an object of class DataHandler.

# getPrices
getPrices: takes the parameters fromDate and toDate. It should return an array or a list of prices for the period specified the two dates. The prices returned should include prices for the start date, the end date, and everything in between.

# computeAverage
computeAverage: takes the parameters fromDate and toDate. It should return the average price for the period specified by the two dates. The calculation of average price should include prices for the start date, the end date, and everything in between.

# computeMax
computeMax: takes the parameters fromDate and toDate. It should return the maximum price for the period specified by the two dates. The calculation of maximum price should include prices for the start date, the end date, and everything in between.

# computeMovingAverage
computeMovingAverage: takes the parameters windowSize, fromDate, and toDate. It should return a moving average of the last n elements of price, where n = windowSize. The prices used in this calculation should include prices for the start date, the end date, and everything in between. For example, if the dates specified are from the 1st of July to the 20th of July and the window size is 10, this method should return an array or list in which the 1st value is the average of the price from the 1st of July through the 10th of July, the 2nd value is the average of the price from the 2nd of July through the 11th of July, and so on, until the last value used in the calculation is the price from the 20th of July.

#insertPrice
insertPrice: takes a price record as a parameter. As in the price file, a single price record has a date, open price, high price, low price, close price, trading volume, and adjusted closing price. The insertPrice method is used to insert a price into the price data contained in an object of class DataHandler. If the date already exists, overwrite the record that is already there. Note that you must keep the data sorted when inserting or overwriting a new price record.

# correctPrices
correctPrices: takes the file name of the corrections file as a parameter. The corrections file looks just like the price file. This method can call the insertPrice method to perform the actual corrections.
