using UnityEngine;
using UnityEngine.AI;

public class FindPlayer : MonoBehaviour
{
    public Transform player;
    NavMeshAgent agent;
    Animator animator;

    void Start()
    {
        agent = gameObject.GetComponent<NavMeshAgent>();
        animator = gameObject.GetComponent<Animator>();
        animator.SetBool("run", true);
    }

    void Update()
    {
        agent.SetDestination(player.position);
    }
}
