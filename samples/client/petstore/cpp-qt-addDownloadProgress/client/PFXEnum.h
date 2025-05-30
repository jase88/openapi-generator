/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#ifndef PFX_ENUM_H
#define PFX_ENUM_H

#include <QJsonObject>
#include <QJsonValue>
#include <QMetaType>
#include <QString>

namespace test_namespace {

class PFXEnum {
public:
    PFXEnum() {}

    PFXEnum(QString jsonString) {
        fromJson(jsonString);
    }

    virtual ~PFXEnum() {}

    virtual QJsonValue asJsonValue() const {
        return QJsonValue(jstr);
    }

    virtual QString asJson() const {
        return jstr;
    }

    virtual QJsonObject asJsonObject() const {
        QJsonObject obj;
        obj["value"] = jstr;
        return obj;
    }
	
    virtual void fromJson(QString jsonString) {
        jstr = jsonString;
    }

    virtual void fromJsonValue(QJsonValue jval) {
        jstr = jval.toString();
    }

    virtual bool isSet() const {
        return false;
    }

    virtual bool isValid() const {
        return true;
    }

private:
    QString jstr;
};

} // namespace test_namespace

Q_DECLARE_METATYPE(test_namespace::PFXEnum)

#endif // PFX_ENUM_H
