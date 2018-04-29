package com.djamware


import grails.rest.*
import grails.converters.*

class CustomerController {
	static responseFormats = ['json', 'xml']

	def scaffold = Customer;
	
    def index() { 
    	def customers = Customer.list()
        [customers:customers]
    }
    def hello(){
    	render("Hello")
    }
}
