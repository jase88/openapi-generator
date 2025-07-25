package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Client;
import java.util.UUID;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class AnotherFakeApi {
    private ApiClient apiClient;

    public AnotherFakeApi() {
        this(new ApiClient());
    }

    public AnotherFakeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * To test special tags
    * To test special tags and operation ID starting with number
    * <p><b>200</b> - successful operation
    * @param uuidTest to test uuid example value
    * @param body client model
    * @return Client
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Client call123testSpecialTags(@javax.annotation.Nonnull UUID uuidTest, @javax.annotation.Nonnull Client body) throws IOException {
        HttpResponse response = call123testSpecialTagsForHttpResponse(uuidTest, body);
        TypeReference<Client> typeRef = new TypeReference<Client>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * To test special tags
    * To test special tags and operation ID starting with number
    * <p><b>200</b> - successful operation
    * @param uuidTest to test uuid example value
    * @param body client model
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Client
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Client call123testSpecialTags(@javax.annotation.Nonnull UUID uuidTest, @javax.annotation.Nonnull Client body, Map<String, Object> params) throws IOException {
        HttpResponse response = call123testSpecialTagsForHttpResponse(uuidTest, body, params);
        TypeReference<Client> typeRef = new TypeReference<Client>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse call123testSpecialTagsForHttpResponse(@javax.annotation.Nonnull UUID uuidTest, @javax.annotation.Nonnull Client body) throws IOException {
        // verify the required parameter 'uuidTest' is set
        if (uuidTest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'uuidTest' when calling call123testSpecialTags");
        }// verify the required parameter 'body' is set
        if (body == null) {
            throw new IllegalArgumentException("Missing the required parameter 'body' when calling call123testSpecialTags");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/another-fake/dummy");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(body);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }

      public HttpResponse call123testSpecialTagsForHttpResponse(@javax.annotation.Nonnull UUID uuidTest, java.io.InputStream body, String mediaType) throws IOException {
          // verify the required parameter 'uuidTest' is set
              if (uuidTest == null) {
              throw new IllegalArgumentException("Missing the required parameter 'uuidTest' when calling call123testSpecialTags");
              }// verify the required parameter 'body' is set
              if (body == null) {
              throw new IllegalArgumentException("Missing the required parameter 'body' when calling call123testSpecialTags");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/another-fake/dummy");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = body == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, body);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
      }

    public HttpResponse call123testSpecialTagsForHttpResponse(@javax.annotation.Nonnull UUID uuidTest, @javax.annotation.Nonnull Client body, Map<String, Object> params) throws IOException {
        // verify the required parameter 'uuidTest' is set
        if (uuidTest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'uuidTest' when calling call123testSpecialTags");
        }// verify the required parameter 'body' is set
        if (body == null) {
            throw new IllegalArgumentException("Missing the required parameter 'body' when calling call123testSpecialTags");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/another-fake/dummy");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(body);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }


}
