#Annotation

####@Entity
Utilisée pour spécifier que la classe d'annotation actuelle représente un type d'entité.
####@Id
Spécifie l'identificateur d'entité. Une entité doit toujours avoir un attribut d'identificateur, qui est utilisé lors du chargement de l'entité
####@GeneratedValue
Spécifie que la valeur d'identificateur d'entité est automatiquement générée
####@JsonIgnore
Permet d'ignorer un paramètre de l'entité, pour ne pas qu'il soit prit en compte.
####@Override
Utilisé pour définir une méthode qui est héritée de la classe parente
####@Controller
Permet de déclarer que la classe suivante est un contrôleur Spring
####@RestController
Est une version spécialisée du contrôleur. Il inclut les annotations @Controller et @ResponseBody et, par conséquent, simplifie l'implémentation du contrôleur
####@Autowired
Permet de faire l’injection de dépendances
####@RequestMapping
Cette annotation mappe les requêtes HTTP aux méthodes de gestion des contrôleurs MVC et REST.
####@GetMapping
Raccourci pour @RequestMapping(method = RequestMethod.GET)
####@PostMapping
Raccourci pour @RequestMapping(method = RequestMethod.POST)
####@PutMapping
Raccourci pour @RequestMapping(method = RequestMethod.PUT)
####@DeleteMapping
Raccourci pour @RequestMapping(method = RequestMethod.DELETE)
####@Test
Déclare un test
####@Query
Pour exécuter du SQL natif
####@PathVariable
Permet d'extraire les variables utilisé dans une URI
####@RequestBody
Permet de désérialiser le corps de la requète
####@Repository
Permet de pouvoir utiliser les méthodes de CRUD de JPA