package com.example

import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.*
import org.springframework.web.client.RequestCallback
import org.springframework.web.client.ResponseExtractor
import org.springframework.web.client.RestOperations
import java.net.URI

class NoOpRestOperations : RestOperations {
    override fun <T : Any?> postForObject(p0: String?, p1: Any?, p2: Class<T>?, vararg p3: Any?): T {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> postForObject(p0: String?, p1: Any?, p2: Class<T>?, p3: MutableMap<String, *>?): T {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> postForObject(p0: URI?, p1: Any?, p2: Class<T>?): T {
        throw UnsupportedOperationException()
    }

    override fun put(p0: String?, p1: Any?, vararg p2: Any?) {
        throw UnsupportedOperationException()
    }

    override fun put(p0: String?, p1: Any?, p2: MutableMap<String, *>?) {
        throw UnsupportedOperationException()
    }

    override fun put(p0: URI?, p1: Any?) {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> exchange(p0: String?, p1: HttpMethod?, p2: HttpEntity<*>?, p3: Class<T>?, vararg p4: Any?): ResponseEntity<T>? {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> exchange(p0: String?, p1: HttpMethod?, p2: HttpEntity<*>?, p3: Class<T>?, p4: MutableMap<String, *>?): ResponseEntity<T>? {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> exchange(p0: URI?, p1: HttpMethod?, p2: HttpEntity<*>?, p3: Class<T>?): ResponseEntity<T>? {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> exchange(p0: String?, p1: HttpMethod?, p2: HttpEntity<*>?, p3: ParameterizedTypeReference<T>?, vararg p4: Any?): ResponseEntity<T>? {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> exchange(p0: String?, p1: HttpMethod?, p2: HttpEntity<*>?, p3: ParameterizedTypeReference<T>?, p4: MutableMap<String, *>?): ResponseEntity<T>? {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> exchange(p0: URI?, p1: HttpMethod?, p2: HttpEntity<*>?, p3: ParameterizedTypeReference<T>?): ResponseEntity<T>? {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> exchange(p0: RequestEntity<*>?, p1: Class<T>?): ResponseEntity<T>? {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> exchange(p0: RequestEntity<*>?, p1: ParameterizedTypeReference<T>?): ResponseEntity<T>? {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> getForEntity(p0: String?, p1: Class<T>?, vararg p2: Any?): ResponseEntity<T>? {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> getForEntity(p0: String?, p1: Class<T>?, p2: MutableMap<String, *>?): ResponseEntity<T>? {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> getForEntity(p0: URI?, p1: Class<T>?): ResponseEntity<T>? {
        throw UnsupportedOperationException()
    }

    override fun headForHeaders(p0: String?, vararg p1: Any?): HttpHeaders? {
        throw UnsupportedOperationException()
    }

    override fun headForHeaders(p0: String?, p1: MutableMap<String, *>?): HttpHeaders? {
        throw UnsupportedOperationException()
    }

    override fun headForHeaders(p0: URI?): HttpHeaders? {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> getForObject(p0: String?, p1: Class<T>?, vararg p2: Any?): T {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> getForObject(p0: String?, p1: Class<T>?, p2: MutableMap<String, *>?): T {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> getForObject(p0: URI?, p1: Class<T>?): T {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> execute(p0: String?, p1: HttpMethod?, p2: RequestCallback?, p3: ResponseExtractor<T>?, vararg p4: Any?): T {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> execute(p0: String?, p1: HttpMethod?, p2: RequestCallback?, p3: ResponseExtractor<T>?, p4: MutableMap<String, *>?): T {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> execute(p0: URI?, p1: HttpMethod?, p2: RequestCallback?, p3: ResponseExtractor<T>?): T {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> postForEntity(p0: String?, p1: Any?, p2: Class<T>?, vararg p3: Any?): ResponseEntity<T>? {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> postForEntity(p0: String?, p1: Any?, p2: Class<T>?, p3: MutableMap<String, *>?): ResponseEntity<T>? {
        throw UnsupportedOperationException()
    }

    override fun <T : Any?> postForEntity(p0: URI?, p1: Any?, p2: Class<T>?): ResponseEntity<T>? {
        throw UnsupportedOperationException()
    }

    override fun optionsForAllow(p0: String?, vararg p1: Any?): MutableSet<HttpMethod>? {
        throw UnsupportedOperationException()
    }

    override fun optionsForAllow(p0: String?, p1: MutableMap<String, *>?): MutableSet<HttpMethod>? {
        throw UnsupportedOperationException()
    }

    override fun optionsForAllow(p0: URI?): MutableSet<HttpMethod>? {
        throw UnsupportedOperationException()
    }

    override fun postForLocation(p0: String?, p1: Any?, vararg p2: Any?): URI? {
        throw UnsupportedOperationException()
    }

    override fun postForLocation(p0: String?, p1: Any?, p2: MutableMap<String, *>?): URI? {
        throw UnsupportedOperationException()
    }

    override fun postForLocation(p0: URI?, p1: Any?): URI? {
        throw UnsupportedOperationException()
    }

    override fun delete(p0: String?, vararg p1: Any?) {
        throw UnsupportedOperationException()
    }

    override fun delete(p0: String?, p1: MutableMap<String, *>?) {
        throw UnsupportedOperationException()
    }

    override fun delete(p0: URI?) {
        throw UnsupportedOperationException()
    }
}