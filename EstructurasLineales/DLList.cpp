#include "DLList.h"
#include "NodeDL.cpp"

template <typename T> class Mylist {
public:
	NodeDL<T>* first;
	NodeDL<T>* last;
	NodeDL<T>* pointer;
	int length;

	DLList() { //Constructor por defecto
		first = NULL;
		last = NULL;
		pointer = NULL;
		length = 0;

	}

	DLList(T d) { //Constructuro con un primer nodo
		NodeDL<T> node = new NodeDL<T>(d);
		//Apuntamos primero y ultimo al nuevo nodo
		*first = node;
		*last = node;
		//Los apuntadores siguiente y atras apuntan a nulo
		node.next = NULL;
		node.back = NULL;
		//Incrementamos el contador de elementos de la lista
		length++;
	}

	//Metodos


	//isEmpty()

	bool isEmpty() {
		return length == 0;
	}

	//Insertar al inicio
	//Escenarios: Lista vacia o Lista con elementos

	void insertFisrt(T d) {
		//Instanciar el nuevo nodo
		NodeDL<T> node = new NoedDL<T>(d);

		if (isEmpty()) { //Si la lista esta vacia
			*first = node;
			*last = node;
		}
		else { //Lista con elementos
			//El next del nuevo nodo apunta a first
			*node.next* = first;								//.next porque es un objeto instanciado
			//El apuntador back de first apunta al nuevo nodo
			first->back = node;					    			 //Flecha cuando es un apuntador
			//El pauntador first apunta al nuevo nodo
			*first = node;
		}
		length++;
	}
	
	//Insertar al final
	//Escenarios: Lista vacia o con elementos
	
	void insertLast(T d) {
		//Instanciar el nuevo nodo
		NodeDL<T> node = new NoedDL<T>(d);
		if (isEmpty()) { //Lista vacia
			*first = node;
			*last = node;
		}
		else { //Lista con elementos
			node.back *= last;
			last->next = node;
			*last = node;
		}
		length++;
	}
	
	//Eliminar primer elemento

	void deleteFirst() {
		if (!isEmpty()) {
			if (length = 1) {
				*first = NULL;
				*last = NULL;
			}
			else {
				*first = first->next;
				*first->back = NULL;
			}
		}
		length--;
	}
	//Eliminar ultimo elemento
	void deleteLast() {
		if (!isEmpty()) {
			if (length = 1) {
				first = NULL;
				last = NULL;
			}
			else {
				pointer = first;
				while (pointer->next != last) {//Recorre la lista y se detiene en el elemento anterior al ultimo
					pointer = pointer.next;
				}
				last = pointer;
				last->next = nullptr;
				pointer = nullptr;
			}
			length--;
				
		}
	}

	//Borra un nodo
	void deleteNode (T data) {
		if (!isEmpty()) {
			if (first->data == data) {
				deleteFirst();
				length --;
			}
			if (last->data == data) {
				deleteLast();
				length--;
			}
			pointer = first;
			do {
				if (pointer->data == data) {
					pointer->prev->next = pointer->next;
					pointer->next->prev = pointer->prev;
					pointer = nullptr;
					length--;
				}
				else pointer = pointer->next;
			} while (pointer != nullptr);
		}
	}
	
	//Muestra la lista de inicio a fin
	void showListInicioFin() {
		if (!isEmpty()) {
			pointer = first;
			std::cout << "first->";
			while (pointer != nullptr) {
				std::cout << "[" << pointer->data << "]";
				pointer = pointer->next;
				if (pointer != nullptr) std::cout << " -> ";
			}
			std::cout << " <- last" << std::endl;
		}
	}

	//Muestra la lista de fin a inicio
	void showListFinInicio() {
		if (!isEmpty()) {
			pointer = last;
			std::cout << "last->";
			while (pointer != nullptr) {
				std::cout << "[" << pointer->data << "]";
				pointer = pointer->prev;
				if (pointer != nullptr) std::cout << " -> ";
			}
			std::cout << " <- first" << std::endl;
		}
	}

};
