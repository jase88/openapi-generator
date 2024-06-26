<?php

/**
 * OpenAPI Petstore
 * PHP version 8.x
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

namespace OpenAPIServer\Api;


abstract class AbstractPetApi
{

    /**
     * Operation addPet
     * Path: /pet
     *
     * Add a new pet to the store
     *
     * @param \OpenAPIServer\Model\Pet $pet Pet object that needs to be added to the store (required)
     *
     * @return \OpenAPIServer\Model\Pet|null
     */
    public function addPet(\OpenAPIServer\Model\Pet $pet): \OpenAPIServer\Model\Pet|null
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation deletePet
     * Path: /pet/{petId}
     *
     * Deletes a pet
     *
     * @param int $petId Pet id to delete (required)
     * @param ?string $apiKey  (optional)
     *
     * @return void
     */
    public function deletePet(int $petId, ?string $apiKey): void
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation findPetsByStatus
     * Path: /pet/findByStatus
     *
     * Finds Pets by status
     *
     * @param array $status Status values that need to be considered for filter (required) (deprecated)
     *
     * @return \OpenAPIServer\Model\Pet[]|null
     */
    public function findPetsByStatus(array $status): array|null
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation findPetsByStatus (stream)
     *
     * Finds Pets by status
     *
     * @param array $status Status values that need to be considered for filter (required) (deprecated)
     *
     */
    public function findPetsByStatusStream(array $status): void
    {
        throw new \Exception('Not implemented');
    }
    /**
     * Operation findPetsByTags
     * Path: /pet/findByTags
     *
     * Finds Pets by tags
     *
     * @param array $tags Tags to filter by (required)
     *
     * @return \OpenAPIServer\Model\Pet[]|null
     * @deprecated
     */
    public function findPetsByTags(array $tags): array|null
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation findPetsByTags (stream)
     *
     * Finds Pets by tags
     *
     * @param array $tags Tags to filter by (required)
     *
     * @deprecated
     */
    public function findPetsByTagsStream(array $tags): void
    {
        throw new \Exception('Not implemented');
    }
    /**
     * Operation getPetById
     * Path: /pet/{petId}
     *
     * Find pet by ID
     *
     * @param int $petId ID of pet to return (required)
     *
     * @return \OpenAPIServer\Model\Pet|null
     */
    public function getPetById(int $petId): \OpenAPIServer\Model\Pet|null
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation updatePet
     * Path: /pet
     *
     * Update an existing pet
     *
     * @param \OpenAPIServer\Model\Pet $pet Pet object that needs to be added to the store (required)
     *
     * @return \OpenAPIServer\Model\Pet|null
     */
    public function updatePet(\OpenAPIServer\Model\Pet $pet): \OpenAPIServer\Model\Pet|null
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation updatePetWithForm
     * Path: /pet/{petId}
     *
     * Updates a pet in the store with form data
     *
     * @param int $petId ID of pet that needs to be updated (required)
     *
     * @return void
     */
    public function updatePetWithForm(int $petId): void
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation uploadFile
     * Path: /pet/{petId}/uploadImage
     *
     * uploads an image
     *
     * @param int $petId ID of pet to update (required)
     *
     * @return \OpenAPIServer\Model\ApiResponse|null
     */
    public function uploadFile(int $petId): \OpenAPIServer\Model\ApiResponse|null
    {
        throw new \Exception('Not implemented');
    }

}
