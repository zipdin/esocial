//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:02 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.monit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informacoes do Vínculo trabalhista e estagiário
 * 
 * <p>Classe Java de TIdeVinculoEstag complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TIdeVinculoEstag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfTrab">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="11"/>
 *               &lt;pattern value="\d{11}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nisTrab" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="matricula" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIdeVinculoEstag", namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", propOrder = {
    "cpfTrab",
    "nisTrab",
    "matricula"
})
public class TIdeVinculoEstag {

    @XmlElement(required = true)
    protected String cpfTrab;
    protected String nisTrab;
    protected String matricula;

    /**
     * Obtém o valor da propriedade cpfTrab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfTrab() {
        return cpfTrab;
    }

    /**
     * Define o valor da propriedade cpfTrab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfTrab(String value) {
        this.cpfTrab = value;
    }

    /**
     * Obtém o valor da propriedade nisTrab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNisTrab() {
        return nisTrab;
    }

    /**
     * Define o valor da propriedade nisTrab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNisTrab(String value) {
        this.nisTrab = value;
    }

    /**
     * Obtém o valor da propriedade matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define o valor da propriedade matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

}
