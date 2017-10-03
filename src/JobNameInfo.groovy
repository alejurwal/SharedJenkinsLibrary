@Grab('com.github.groovy-wslite:groovy-wslite:1.1.3')
import wslite.http.auth.*;
import wslite.rest.*;
import wslite.soap.*;
import wslite.*;
def client = new SOAPClient('http://www.holidaywebservice.com/Holidays/US/Dates/USHolidayDates.asmx')
def response = client.send(SOAPAction:'http://www.27seconds.com/Holidays/US/Dates/GetMothersDay') {
    body {
        GetMothersDay('xmlns':'http://www.27seconds.com/Holidays/US/Dates/') {
            year(2011)
        }
    }
}
