/**
 */
package model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link model.Person#getNationality <em>Nationality</em>}</li>
 *   <li>{@link model.Person#isMarried <em>Married</em>}</li>
 *   <li>{@link model.Person#getBirthday <em>Birthday</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see model.ModelPackage#getPerson_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link model.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Nationality</b></em>' attribute.
	 * The literals are from the enumeration {@link model.Nationality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationality</em>' attribute.
	 * @see model.Nationality
	 * @see #setNationality(Nationality)
	 * @see model.ModelPackage#getPerson_Nationality()
	 * @model
	 * @generated
	 */
	Nationality getNationality();

	/**
	 * Sets the value of the '{@link model.Person#getNationality <em>Nationality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationality</em>' attribute.
	 * @see model.Nationality
	 * @see #getNationality()
	 * @generated
	 */
	void setNationality(Nationality value);

	/**
	 * Returns the value of the '<em><b>Married</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Married</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Married</em>' attribute.
	 * @see #setMarried(boolean)
	 * @see model.ModelPackage#getPerson_Married()
	 * @model
	 * @generated
	 */
	boolean isMarried();

	/**
	 * Sets the value of the '{@link model.Person#isMarried <em>Married</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Married</em>' attribute.
	 * @see #isMarried()
	 * @generated
	 */
	void setMarried(boolean value);

	/**
	 * Returns the value of the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birthday</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthday</em>' attribute.
	 * @see #setBirthday(Date)
	 * @see model.ModelPackage#getPerson_Birthday()
	 * @model
	 * @generated
	 */
	Date getBirthday();

	/**
	 * Sets the value of the '{@link model.Person#getBirthday <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthday</em>' attribute.
	 * @see #getBirthday()
	 * @generated
	 */
	void setBirthday(Date value);

} // Person
